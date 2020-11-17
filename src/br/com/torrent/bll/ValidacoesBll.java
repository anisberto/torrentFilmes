package br.com.torrent.bll;

import br.com.torrent.dal.CategoriaDal;
import br.com.torrent.dal.UsuLoginDal;
import br.com.torrent.model.CategoriaFilmesModel;
import br.com.torrent.model.PlanoModel;
import br.com.torrent.model.UsuLoginModel;
import java.util.InputMismatchException;
import java.util.List;

public class ValidacoesBll {
    
    CategoriaDal catDal;
    public ValidacoesBll() throws Exception {
        catDal = new CategoriaDal();
    }

    
    public static boolean validaUsuario(UsuLoginModel usuarioTela) throws Exception {
        UsuLoginDal usuarioLog = new UsuLoginDal();
        UsuLoginModel usuario = usuarioLog.findName(usuarioTela.getLogin());

        if (usuario.getLogin().contains(usuarioTela.getLogin()) && usuario.getSenha().equalsIgnoreCase(usuarioTela.getSenha())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarEntradaDeDadosPlano(PlanoModel plano) {
        return !plano.getNome().isEmpty() && plano.getPreco() > 0 && plano.getNome().length() >= 5 && plano.getNome().length() <= 20;
    }

    public static boolean validarAlteracao(PlanoModel plano) {
        return !plano.getNome().isEmpty() && plano.getPreco() > 0 && plano.getNome().length() >= 5 && plano.getNome().length() <= 20;
    }

    public boolean isCPF(String cpf) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (cpf.equals("00000000000")
                || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")
                || (cpf.length() != 11)) {
            return (false);
        }
        char dig10, dig11;
        int sm, i, r, num, peso;
        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0         
                // (48 eh a posicao de '0' na tabela ASCII)         
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }
    
    public void validarCategoria(CategoriaFilmesModel objeto) throws Exception {
        String nome = objeto.getNome().trim().toLowerCase();
        String invalidos = "!@#$%¨&*()+={[}]/?><;:";
        for (int i = 0; i < invalidos.length(); i++) {
            if (nome.contains("" + invalidos.charAt(i))) {
                throw new Exception("Descrição inválida para esta categoria!\n");
            }
        }
        if (nome.equals("")) {
            throw new Exception("Informe a descrição da categoria\n");
        }
        if (nome.length() < 3) {
            throw new Exception("A descrição da categoria deve ter no mínimo 3 letras!\n");
        }

        List<CategoriaFilmesModel> lista = catDal.getAllCategorias();
        for (int pos = 0; pos < lista.size(); pos++) {
            CategoriaFilmesModel cat = lista.get(pos);
            if (nome.equalsIgnoreCase(cat.getNome())) {
                throw new Exception("A descrição informada já existe no cadastro"
                        + "de categorias\n");
            }
        }
    }

}

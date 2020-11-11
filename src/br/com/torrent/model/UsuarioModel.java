package br.com.torrent.model;

public class UsuarioModel {

    private int iden;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private CupomModel cupom;

    public UsuarioModel() {
    }

    public UsuarioModel(String cpf) {
        this.cpf = cpf;
    }

    public UsuarioModel(int iden, String nome, String cpf, String email, String senha, CupomModel cupom) {
        this.iden = iden;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.cupom = cupom;
    }

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
//    public void setCpf(String cpf) throws Exception {
//        if (isCPF(cpf) == false) {
//            throw new Exception("Cpf Invalido!!!");
//        }
//        this.cpf = cpf;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public CupomModel getCupom() {
        return cupom;
    }

    public void setCupom(CupomModel cupom) {
        this.cupom = cupom;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" + "iden=" + iden + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha + ", cupom=" + cupom.getPorcentagem() + '}';
    }

//    private boolean isCPF(String cpf) {
//        // considera-se erro CPF's formados por uma sequencia de numeros iguais
//        if (cpf.equals("00000000000")
//                || cpf.equals("11111111111")
//                || cpf.equals("22222222222") || cpf.equals("33333333333")
//                || cpf.equals("44444444444") || cpf.equals("55555555555")
//                || cpf.equals("66666666666") || cpf.equals("77777777777")
//                || cpf.equals("88888888888") || cpf.equals("99999999999")
//                || (cpf.length() != 11)) {
//            return (false);
//        }
//        char dig10, dig11;
//        int sm, i, r, num, peso;
//        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
//        try {
//            // Calculo do 1o. Digito Verificador
//            sm = 0;
//            peso = 10;
//            for (i = 0; i < 9; i++) {
//                // converte o i-esimo caractere do CPF em um numero:
//                // por exemplo, transforma o caractere '0' no inteiro 0         
//                // (48 eh a posicao de '0' na tabela ASCII)         
//                num = (int) (cpf.charAt(i) - 48);
//                sm = sm + (num * peso);
//                peso = peso - 1;
//            }
//
//            r = 11 - (sm % 11);
//            if ((r == 10) || (r == 11)) {
//                dig10 = '0';
//            } else {
//                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
//            }
//            // Calculo do 2o. Digito Verificador
//            sm = 0;
//            peso = 11;
//            for (i = 0; i < 10; i++) {
//                num = (int) (cpf.charAt(i) - 48);
//                sm = sm + (num * peso);
//                peso = peso - 1;
//            }
//
//            r = 11 - (sm % 11);
//            if ((r == 10) || (r == 11)) {
//                dig11 = '0';
//            } else {
//                dig11 = (char) (r + 48);
//            }
//
//            // Verifica se os digitos calculados conferem com os digitos informados.
//            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
//                return (true);
//            } else {
//                return (false);
//            }
//        } catch (InputMismatchException erro) {
//            return (false);
//        }
//    }

}

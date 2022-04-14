public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public void mudaCPF(String cpf) {
        if(validaCPF(cpf) == true) {
            this.setCpf(cpf);
            System.out.println("CPF validado e alterado!");
        }
        else {
            System.out.println("Negado!");
        }
    }

    private boolean validaCPF(String cpf) {
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");

        if(cpf.length() == 11) {
            // Vamos verificar.
            char dv1 = cpf.charAt(9);
            char dv2 = cpf.charAt(10);

            int dv1_int = Character.getNumericValue(dv1);
            int dv2_int = Character.getNumericValue(dv2);

            int vCPF[] = new int[11];
            int vCPF_aux = 0;
            
            for (int i = 0; i < cpf.length(); i++) {
                vCPF[i] = Character.getNumericValue(cpf.charAt(i));
            }

            for (int i = 0; i < vCPF.length - 2; i++) {
                int j = 10;
                vCPF_aux = vCPF_aux + (vCPF[i] * (j - i));
            }
            
            if(((vCPF_aux % 11) < 2 ) && vCPF_aux % 11 == Character.getNumericValue(dv1)) {
                dv1_int = 0;
            } else if (((vCPF_aux % 11) > 2) && vCPF_aux % 11 == Character.getNumericValue(dv1)) {
                dv1_int = 11 - (vCPF_aux % 11);
            }
            vCPF_aux = 0;
            for (int i = 0; i < vCPF.length - 1; i++) {
                int j = 11;

                vCPF_aux = vCPF_aux + (vCPF[i] * (j - i));
            }
            
            if(((vCPF_aux % 11) < 2 ) && vCPF_aux % 11 == Character.getNumericValue(dv2)) {
                dv2_int = 0;
            } else if (((vCPF_aux % 11) > 2) && vCPF_aux % 11 == Character.getNumericValue(dv2));  {
                dv2_int = 11 - (vCPF_aux % 11);
            }

            if((vCPF[9] == dv1_int) && vCPF[10] == dv2_int ) {
                return true;
            }
        }
        return false;
    }
        public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

        public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        // Está atribuição não deve ser permitida!
        // Vamos verificar.
        if (validaCPF(cpf)){
            this.cpf = cpf;
        }
    }

        public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

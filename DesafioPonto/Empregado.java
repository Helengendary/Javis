public class Empregado {

        private String nome;

        private Long cpf;
        private int datanasc;  
        private int senha;            

    
        // Construtor
        public Empregado(String nome, Long cpf, int datanasc, int senha) {
            this.nome = nome;
            this.cpf = cpf;
            this.datanasc = datanasc;
            this.senha = senha;
        }
    
        // Métodos getters e setters
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public Long getCpf() {
            return cpf;
        }
    
        public void setCpf(Long cpf) {
            this.cpf = cpf;
        }
    
        public int getDatanasc() {
            return datanasc;
        }
    
        public void setDatanasc(int datanasc) {
            this.datanasc = datanasc;
        }
    
        public void setSenha(int senha) {
            this.senha = senha;
        }

        public int getSenha() {
            return senha;
        }
}

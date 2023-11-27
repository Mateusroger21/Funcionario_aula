class Cargo {
        private String nome;
        private double salarioBase;
        private String beneficios;

        public Cargo(String nome, double salarioBase, String beneficios) {
            this.nome = nome;
            this.salarioBase = salarioBase;
            this.beneficios = beneficios;
        }

        public double calcularSalario(int horasTrabalhadas) {
            return salarioBase * horasTrabalhadas;
        }

        public String getNome() {
            return nome;
        }

    }


package com.itfactory.componente;

    public class Motor {
        private String marcaProductie;
        private int capacitateMotor;
        private double pretVanzare;

        public Motor(String marcaProductie, int capacitateMotor, double pretVanzare) {
            this.marcaProductie = marcaProductie;
            this.capacitateMotor = capacitateMotor;
            this.pretVanzare = pretVanzare;
        }

        public String getMarcaProductie() {
            return marcaProductie;
        }

        public void setMarcaProductie(String marcaProductie) {
            this.marcaProductie = marcaProductie;
        }

        public int getCapacitateMotor() {
            return capacitateMotor;
        }

        public void setCapacitateMotor(int capacitateMotor) {
            this.capacitateMotor = capacitateMotor;
        }

        public double getPretVanzare() {
            return pretVanzare;
        }

        public void setPretVanzare(double pretVanzare) {
            this.pretVanzare = pretVanzare;
        }
    }



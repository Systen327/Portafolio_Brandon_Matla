    package com.brandonmatla.tienda.model;

    public class telefono {

        private String nombre;
        private String marca;
        private int ram;
        private int bateria;
        private float  precio;
        private String imagen;

        public telefono()
        {}
        public telefono(String nombre, String marca, int ram, int bateria, float precio, String imagen) {
            this.nombre = nombre;
            this.marca = marca;
            this.ram = ram;
            this.bateria = bateria;
            this.precio = precio;
            this.imagen = imagen;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public int getBateria() {
            return bateria;
        }

        public void setBateria(int bateria) {
            this.bateria = bateria;
        }

        public float getPrecio() {
            return precio;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        public String getImagen() {
            return imagen;
        }

        public void setImagen(String imagen) {
            this.imagen = imagen;
        }

        

        
   




    }

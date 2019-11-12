package iTexico_class10_POO;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OperacionBanco {



    private  ArrayList<CajeroATM> cajeros = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private List<Empleado> empleados = new ArrayList<Empleado>();



// Branch operación banco
    private String opBa;



    public void agregarCliente() {

        System.out.println("Cuántos clientes desea dar de alta? ");
        Scanner input = new Scanner(System.in);
        int opcion = input.nextInt();

        for (int i = 0; i < opcion; i++) {

            Cliente cliente = new Cliente();

            System.out.println("Ingrese el ID del cliente: ");

            try {
                int clientId = input.nextInt();
                cliente.setId(clientId);


            } catch (InputMismatchException e){

                System.out.println("Incorrect! Escribe un número");
            }
            System.out.println("Ingrese el nombre del Cliente ");
            String clientName = input.next();
            cliente.setNombre(clientName);

            System.out.println("Ingrese el saldo del Cliente ");
            float saldoCliente = input.nextFloat();
            cliente.setSaldo(saldoCliente);

            clientes.add(cliente);


        }
        System.out.println("Usuarios agregados!");



            System.out.println("Qué deseas hacer?");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Regresar al Menú Principal!");


            opcion = input.nextInt();

            switch(opcion) {


                case 1:
                    System.out.println("Ingresa el ID del cliente");
                    int idCliente = input.nextInt();
                    for (int x = 0; x < clientes.size(); x++) {
                        if(idCliente == clientes.get(x).getId()){

                            System.out.println("El saldo de " + clientes.get(x).getNombre() + ", es de: " + clientes.get(x).getSaldo());


                        }
                    }
                case 2: System.out.println("\nSelecciona la opción deseada:");

                        System.out.println("\n1. Agregar Usuarios:");
                        System.out.println("\n2. Agregar ATM:");
                        System.out.println("\n3. Agregar Clientes:");
                        System.out.println("\n4. Agregar Empleados:");

                        OperacionBanco oBank = new OperacionBanco();

                        opcion = input.nextInt();

                            switch(opcion) {


                                case 1 :

                                    break;



                                case 2 : oBank.agregarATM();

                                    break;


                                case 3: oBank.agregarCliente();

                                    break;



                                case 4: oBank.agregarEmpleado();

                                    break;



                        }
            }

        for (int y = 0; y < clientes.size(); y++) {

            System.out.println("\nCliente No. - " + y);
            System.out.println("\nNombre: " + clientes.get(y).getNombre());
            System.out.println("ID: " + clientes.get(y).getId());


        }
    }

        public void agregarATM() {

            System.out.println("Cuántos cajeros desea dar de alta? ");
            Scanner input = new Scanner(System.in);
            int opcion = input.nextInt();


            for(int i=0; i < opcion; i++) {

                CajeroATM b1 = new CajeroATM();

                System.out.println("Ingrese el nombre del fabricante: ");
                String nameC = input.next();
                b1.getManufactured().setName(nameC);

                System.out.println("Ingrese el país de origen: ");
                String paisC = input.next();
                b1.getManufactured().setCountry(paisC);

                System.out.println("Ingrese el año: ");
                String yearC = input.next();
                b1.getManufactured().setYear(yearC);

                cajeros.add(b1);



            }

            for (int y = 0; y < cajeros.size(); y++) {

                System.out.println("\nCajero - " + y);
                System.out.println("\nFabriante: " + cajeros.get(y).getManufactured().getName());
                System.out.println("País: " + cajeros.get(y).getManufactured().getCountry());
                System.out.println("Año: " + cajeros.get(y).getManufactured().getYear());

            }


        }

        public void agregarEmpleado(){



            Scanner input = new Scanner(System.in);
            System.out.println("\nQué tipo de empleado desea dar de alta?:");

            System.out.println("\n1. Gerente:");
            System.out.println("\n2. Asesor:");
            System.out.println("\n3. Intendente:");

            int opcion = input.nextInt();

            switch (opcion){


                case 1: System.out.println("Cuántos Gerentes desea dar de alta? ");

                        opcion = input.nextInt();
                        //Empleado empleado = new Empleado();

                        //Person gerente = new Gerente();


                            for(int i=0; i < opcion; i++){
                                Gerente gerente = new Gerente();

                                System.out.println("Ingrese el nombre del Gerente no." + i);
                                String nameE = input.next();
                                gerente.setNombre(nameE);

                                System.out.println("Ingrese el ID del Gerente no." + i);
                                int idE = input.nextInt();
                                gerente.setId(idE);

                                System.out.println("Ingrese la afore del Gerente no." + i);
                                int afore = input.nextInt();
                                gerente.setAfore(afore);

                                Empleado ger = (Empleado)gerente;
                                //empleado.setGerente(gerente);
                                empleados.add(ger);

                                ger = new Gerente();



                            }
                            for (int y = 0; y < empleados.size(); y++) {

                                System.out.println("\nEmpleado No. - " + y);
                                System.out.println("Nombre:" + empleados.get(y).getNombre());
                                System.out.println("ID:" + empleados.get(y).getId());



                                    Empleado ger = empleados.get(y);

                                        if(ger instanceof Gerente){

                                            Gerente gerente1 = (Gerente)ger;
                                            System.out.println("Afore:" + gerente1.getAfore());

                                        }





                            }
                    break;

                case 2: System.out.println("Cuántos Asesores desea dar de alta? ");

                            opcion = input.nextInt();
                    //Empleado empleado = new Empleado();
                            //empleado = new Empleado();



                            for(int i=0; i < opcion; i++){

                                Asesor asesor = new Asesor();

                                System.out.println("Ingrese el nombre del Asesor no." + i);
                                String nameE = input.next();
                                asesor.setNombre(nameE);

                                System.out.println("Ingrese el ID del Asesor no." + i);
                                int idE = input.nextInt();
                                asesor.setId(idE);

                                System.out.println("Ingrese el número de visa del Asesor no." + i);
                                int noVisa = input.nextInt();
                                asesor.setNoVisa(noVisa);

                                Empleado ase = (Empleado)asesor;
                                //empleado.setAsesor(asesor);
                                empleados.add(ase);

                                ase = new Asesor();



                    }
                    for (int y = 0; y < empleados.size(); y++) {

                        System.out.println("\nEmpleado No. - " + y);
                        System.out.println("Nombre:" + empleados.get(y).getNombre());
                        System.out.println("ID:" + empleados.get(y).getId());



                            Empleado asex = empleados.get(y);

                            if(asex instanceof Asesor){

                                Asesor asesor1 = (Asesor)asex;
                                System.out.println("No. Visa:" + asesor1.getNoVisa());

                            }







                    }
                    break;

                case 3: System.out.println("Cuántos Intendentes desea dar de alta? ");

                            opcion = input.nextInt();
                            //empleado = new Empleado();



                            for(int i=0; i < opcion; i++){

                                Intendente intendente = new Intendente();


                                System.out.println("Ingrese el nombre del Intendente no." + i);
                                String nameE = input.next();
                                intendente.setNombre(nameE);

                                System.out.println("Ingrese el ID del Intendente no." + i);
                                int idE = input.nextInt();
                                intendente.setId(idE);

                                System.out.println("Ingrese el número de seguro social del Intendente no." + i);
                                int noVisa = input.nextInt();
                                intendente.getNss();

                                Empleado inte = (Empleado)intendente;
                                //empleado.setIntendente(intendente);
                                empleados.add(inte);

                                inte = new Intendente();



                            }
                    for (int y = 0; y < empleados.size(); y++) {

                        System.out.println("\nEmpleado No. - " + y);
                        System.out.println("Nombre:" + empleados.get(y).getNombre());
                        System.out.println("ID:" + empleados.get(y).getId());



                            Empleado inte = empleados.get(y);

                            if(inte instanceof Intendente){

                                Intendente intendente1 = (Intendente) inte;
                                System.out.println("No. Visa:" + intendente1.getNss());

                            }







                    }
                    break;

            }
        }



    }




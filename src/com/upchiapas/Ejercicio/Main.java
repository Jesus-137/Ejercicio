package com.upchiapas.Ejercicio;

import com.upchiapas.Ejercicio.models.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Alumno> listaAlumno =new ArrayList<Alumno>();
    static Scanner entrada =new Scanner(System.in);
    static Alumno alumno;

    public static void main(String[] args) {
        registroAlumno();
    }
    public static void registroAlumno(){
        int matricula, i, cantidad;
        String nombre;

        System.out.println("Número de alumnos? ");
        cantidad=entrada.nextInt();
        cantidad=validarNumero(cantidad);
        entrada.nextLine();
        for (i=0; i<cantidad; i++){
            System.out.println("Matricula: ");
            matricula= entrada.nextInt();
            matricula=validarMatricula(matricula);
            System.out.println("Nombre: ");
            nombre=entrada.next();
            entrada.nextLine();
            alumno=new Alumno();
            alumno.setMatricula(matricula);
            alumno.setNombre(nombre);
            listaAlumno.add(alumno);
        }
        mostrarTodo(cantidad);
    }
    public static int validarNumero(int cantidad){
        while (cantidad<=0){
            System.out.println("la cantidad debe ser mayor a 0");
            cantidad=entrada.nextInt();
        }
        return cantidad;
    }
    public static int validarMatricula(int matricula){
        while (matricula<=100000||matricula>=999999){
            System.out.println("error la matricula debe tener 6 digitos");
            matricula= entrada.nextInt();
        }
        return matricula;
    }
    public static void mostrarTodo(int cantidad){
        for (int i=0;i<cantidad;i++){
            System.out.println("El nombre del alumno es: "+listaAlumno.get(i).getNombre()+" La matricula es: "+listaAlumno.get(i).getMatricula());
        }
    }
}

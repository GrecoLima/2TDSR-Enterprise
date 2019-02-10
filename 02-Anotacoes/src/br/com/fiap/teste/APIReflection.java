package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.bean.Aluno;

public class APIReflection {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
//		API Reflection -  Recuperar Methods
		Method[] metodos = aluno.getClass().getDeclaredMethods();
		for (Method item : metodos) {
			System.out.println(item.getName());
		}
		
//		API Reflection -  Recuperar atributos
		Field[] atributos = aluno.getClass().getDeclaredFields();
		for (Field item : atributos) {
			System.out.println(item.getName());
		}
	}
}

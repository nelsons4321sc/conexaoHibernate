package br.com.conexao;

import org.hibernate.Session;
public class ConectaHibernateMySQL {
	public static void main(String[] args) {
		Session sessao = null;
		sessao = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Par�bens, voc� fez conex�o no Hibernate");
		sessao.close();
	}
}

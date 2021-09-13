package hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");/* hello = persistence.xml*/

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        /*try {
            //====== 맴버 insert 할때! ========//
            Member member = new Member();

            member.setId(2L);
            member.setName("HelloB");

            em.persist(member);

            tx.commit();
        }*/

        /*try {
            //====== 맴버 select 할때! ========//
            Member findMember = em.find(Member.class, 1L);
            System.out.println("findMember.id=" + findMember.getId());
            System.out.println("findMember.name=" + findMember.getName());

            tx.commit();
        }*/

        /*try {
            //====== 맴버 delete 할때! ========//
            Member findMember = em.find(Member.class, 1L);

            em.remove(findMember); //1L 삭제

            tx.commit();
        }*/

        /*try {
            //====== 맴버 update 할때! ========//
            Member findMember = em.find(Member.class, 1L);
            findMember.setName("HelloJPA");
            tx.commit();
        }*/

        /*try {
            List<Member> result = em.createQuery("select m from Member as m",Member.class)
                    .setFirstResult(0)
                    .setMaxResults(5)
                    .getResultList();
            for (Member member : result ){
                System.out.println("member.name = "+member.getName());
            }

            tx.commit();
        }*/

        try {
            Member member = new Member();
            member.setId(100L);
            member.setName("HelloJPA");

            System.out.println("=== BEFORE ===");
            em.persist(member);
            System.out.println("=== AFTER ===");



            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}


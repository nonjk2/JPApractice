package hellojpa;

import javax.persistence.*;


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

        /*try {
            Member member = new Member();
            member.setId(101L);
            member.setName("HelloJPA");

            System.out.println("=== BEFORE ===");
            em.persist(member);
            System.out.println("=== AFTER ===");
            Member findMember1 = em.find(Member.class, 101L);
            Member findMember2 = em.find(Member.class, 101L);

            System.out.println("result = " + (findMember2==findMember1)); // 1차캐시로 꺼내오고 ==비교연산자 가능



            tx.commit();
        }*/
        /*try {

            Member member1 = new Member(170L, "A");
            Member member2 = new Member(180L, "B");

            em.persist(member1);
            em.persist(member2);

            System.out.println("===================================");


            tx.commit();
        }*/
        /*try {

            //영속
            Member member = em.find(Member.class, 150L);
            member.setName("Z");
            tx.commit();
        }*/
        try {

            Member member = new Member();
            member.setUsername("C");
            em.persist(member);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}


package hellojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*@Table(name = "USER") -> 이렇게하면 테이블 이름마다 이렇게 할수있음*/
public class Member {


    @Id
    private Long id;

    @Column(unique = true, length = 10)
    private String name;
    private String age;

    public Member() {
    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

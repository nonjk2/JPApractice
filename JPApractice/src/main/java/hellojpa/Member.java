package hellojpa;

import javax.persistence.*;
import java.util.Date;

@Entity
/*@Table(name = "USER") -> 이렇게하면 테이블 이름마다 이렇게 할수있음*/
public class Member {

    /*1. 회원은 일반 회원과 관리자로 구분해야 한다.
    2. 회원 가입일과 수정일이 있어야 한다.
    3. 회원을 설명할 수 있는 필드가 있어야 한다. 이 필드는 길이 제한이 없다.*/
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "name")
    private String username;

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

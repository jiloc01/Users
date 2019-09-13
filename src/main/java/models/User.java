package models;
import javax.persistence.*;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    public User(){
    }
    public User(String name, int age){
        this.name=name;
        this.age=age;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    @Override
    public String toString(){
        return "models.User{" +
                "id" + id +
                ", name = '" + name + '\''+
                ", age = " + age + '}';
    }

}

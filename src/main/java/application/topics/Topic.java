package application.topics;

import javax.persistence.*;

@Entity
@Table(name="topics")
public class Topic {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id")
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;

    public Topic(String id,String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public Topic() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}

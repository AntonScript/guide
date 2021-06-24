package guide.model;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private Integer rating;

    @ManyToOne
    private Place place;
    @ManyToOne
    private User user;

}

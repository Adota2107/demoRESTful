package adota.spring.demorestful.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "varchar(500")
    private String title;
    @Column(columnDefinition = "varchar(max)")
    private String description;
}

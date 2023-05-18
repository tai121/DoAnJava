package doan.tai.entiry;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false, length = 45)
    private String name;

    @Column(name = "Description", nullable = false, length = 45)
    private String description;

    @Column(name = "Status", nullable = false)
    private Byte status;

    @OneToMany(mappedBy = "category")
    private Set<Product> products = new LinkedHashSet<>();

}
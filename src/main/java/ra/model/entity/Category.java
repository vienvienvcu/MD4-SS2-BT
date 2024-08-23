package ra.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Category {
    @Id
    private String categoryId;
    private String categoryName;
    private Boolean categoryStatus;

    @OneToMany(mappedBy = "category")
    private List<Product> productList;
}

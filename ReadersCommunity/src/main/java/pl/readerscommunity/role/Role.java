package pl.readerscommunity.role;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "role")
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String name;
}

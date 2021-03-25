package pl.readerscommunity.users;

import lombok.*;
import pl.readerscommunity.role.Role;

import javax.persistence.*;

@Entity
@Table(name= "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String username;

    @NonNull
    private String email;

    @NonNull
    private String password;

    private String photo;

    @NonNull
    @OneToOne
    private Role role;


}

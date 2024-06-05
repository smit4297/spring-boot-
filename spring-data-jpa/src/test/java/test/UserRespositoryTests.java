package test;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.npci.entities.User;
import com.npci.repositiory.UserSpringDataJPARepository;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRespositoryTests {

    @Autowired
    private UserSpringDataJPARepository userRepository;

    @Test
    public void givenUserObject_whenSave_thenReturnSavedEmployee() {

        // given - precondition or setup
        User user = new User();
        user.setFullName("Naveen Pn");
        user.setDob(LocalDate.parse("19-12-1985", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        user.setEmail("abc@gmail.com");
        user.setMobile("7837");
        user.setPassword("Test@1234");

        // when - action or behavior
        User savedUser = userRepository.save(user);

        // then - verify the output
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getUserId()).isGreaterThan(0);
        assertThat(savedUser.getFullName()).isEqualTo("Naveen Pn");
        assertThat(savedUser.getDob()).isEqualTo(LocalDate.parse("19-12-1985", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        assertThat(savedUser.getEmail()).isEqualTo("abc@gmail.com");
        assertThat(savedUser.getMobile()).isEqualTo("7837");
        assertThat(savedUser.getPassword()).isEqualTo("Test@1234");
    }
}

package ahoblit.SpringBootURLShortener.domain.models;

import java.io.Serializable;

/**
 * DTO for {@link ahoblit.SpringBootURLShortener.domain.entities.User}
 */
public record UserDto(Long id, String name) implements Serializable {
}
package ahoblit.SpringBootURLShortener.domain.services;

import ahoblit.SpringBootURLShortener.domain.entities.ShortUrl;
import ahoblit.SpringBootURLShortener.domain.models.ShortUrlDto;
import ahoblit.SpringBootURLShortener.domain.repositories.ShortUrlRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShortUrlService {

    private final ShortUrlRepository shortUrlRepository;
    private final EntityMapper entityMapper;

    public ShortUrlService(ShortUrlRepository shortUrlRepository, EntityMapper entityMapper) {
        this.shortUrlRepository = shortUrlRepository;
        this.entityMapper = entityMapper;
    }

    public List<ShortUrlDto> findAllPublicShortUrls() {
        return shortUrlRepository.FindPublicShortUrls().stream().map(entityMapper::toShortUrlDto).toList();
    }
}

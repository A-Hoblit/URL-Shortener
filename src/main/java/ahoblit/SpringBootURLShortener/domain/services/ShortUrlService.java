package ahoblit.SpringBootURLShortener.domain.services;

import ahoblit.SpringBootURLShortener.domain.entities.ShortUrl;
import ahoblit.SpringBootURLShortener.domain.repositories.ShortUrlRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShortUrlService {

    private final ShortUrlRepository shortUrlRepository;

    public ShortUrlService(ShortUrlRepository shortUrlRepository) {
        this.shortUrlRepository = shortUrlRepository;
    }

    public List<ShortUrl> findAllPublicShortUrls() {
        return shortUrlRepository.FindPublicShortUrls();
    }
}

package pe.upc.example.news.domain.services;

import pe.upc.example.news.domain.model.aggregates.FavoriteSource;
import pe.upc.example.news.domain.model.commands.*;

import java.util.List;
import java.util.Optional;

public interface FavoriteSourceCommandService {
    Optional<FavoriteSource> handle(CreateFavoriteSourceCommand command);
    Optional<FavoriteSource> handle(DeleteFavoriteSourceCommand command);
    Optional<FavoriteSource> handle(UpdateFavoriteSourceCommand command);
}

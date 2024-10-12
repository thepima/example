package pe.upc.example.news.application;

import pe.upc.example.news.domain.model.aggregates.FavoriteSource;
import pe.upc.example.news.domain.model.commands.CreateFavoriteSourceCommand;
import pe.upc.example.news.domain.model.commands.DeleteFavoriteSourceCommand;
import pe.upc.example.news.domain.model.commands.UpdateFavoriteSourceCommand;
import pe.upc.example.news.domain.services.FavoriteSourceCommandService;

import java.util.Optional;

public class FavoriteSourceCommandServiceImpl implements FavoriteSourceCommandService {
    @Override
    public Optional<FavoriteSource> handle(CreateFavoriteSourceCommand command) {
        return Optional.empty();
    }

    @Override
    public Optional<FavoriteSource> handle(DeleteFavoriteSourceCommand command) {
        return Optional.empty();
    }

    @Override
    public Optional<FavoriteSource> handle(UpdateFavoriteSourceCommand command) {
        return Optional.empty();
    }
}

package pe.upc.example.news.domain.services;

import pe.upc.example.news.domain.model.aggregates.FavoriteSource;
import pe.upc.example.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import pe.upc.example.news.domain.model.queries.GetFavoriteSourceQuery;

import java.util.List;
import java.util.Optional;

public interface FavoriteSourceQueryService {
    Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query);
    Optional<List<FavoriteSource>> handle(GetFavoriteSourceQuery query);
}
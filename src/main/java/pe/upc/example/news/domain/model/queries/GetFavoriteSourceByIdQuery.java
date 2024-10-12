/**
 * GetFavoriteSourceByIdQuery
 *
 * @Summary
 * GetFavoriteSourceByIdQuery is a query class that represents the request to get a favorite source by its id.
 * It is responsible for managing the favorite source information and the domain events.
 */
package pe.upc.example.news.domain.model.queries;

public record GetFavoriteSourceByIdQuery(Long id) {
    public GetFavoriteSourceByIdQuery{
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("id must be greater than 0");
        }
    }
}

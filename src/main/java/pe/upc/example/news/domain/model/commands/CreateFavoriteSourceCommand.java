/**
 *  CreateFavoriteSourceCommand
 *
 * @Summary
 *  This class is used to create a new favorite source
 *  It is responsible for managing the favorite source information and the domain events.
 */
package pe.upc.example.news.domain.model.commands;

public record CreateFavoriteSourceCommand(Long id, String name) {
     public CreateFavoriteSourceCommand {
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
        if (id <= 0) {
            throw new IllegalArgumentException("id must be greater than 0");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is required");
        }
    }
}

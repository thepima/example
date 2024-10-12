/**
 * UpdateFavoriteSourceCommand
 *
 * @Summary
 * UpdateFavoriteSourceCommand is a command class that contains the id of the favorite source to be updated.
 * It is responsible for managing the favorite source information and the domain events.
 */
package pe.upc.example.news.domain.model.commands;

public record UpdateFavoriteSourceCommand(Long id) {
    public UpdateFavoriteSourceCommand {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
    }
}

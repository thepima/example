/**
 * DeleteFavoriteSourceCommand
 *
 * @Sumary
 * This class represents the command to delete a favorite source.
 * It is responsible for managing the favorite source information and the domain events.
 */
package pe.upc.example.news.domain.model.commands;

public record DeleteFavoriteSourceCommand(Long id) {
    public DeleteFavoriteSourceCommand {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }
    }
}

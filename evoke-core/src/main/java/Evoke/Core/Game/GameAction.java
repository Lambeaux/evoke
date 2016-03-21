package Evoke.Core.Game;

import java.util.Date;

import Evoke.Core.Moveable;

/**
 * Holds the metadata for a single game action.
 */
public class GameAction implements Moveable {
    private Date timeCreated;

    private String actionCode;

    /**
     * Constructor. A valid action code is required. Validation occurs at a different
     * level of the process, in TODO: Where does validation take place?
     *
     * @param actionCode the action code corresponding to the occurred action in
     *                   the ontology.
     */
    public GameAction(String actionCode) {
        this.timeCreated = new Date();
        this.actionCode = actionCode;
    }

    /**
     * {@inheritDoc}
     * <p>
     * This implementation stores the date and time on construction.
     *
     * @return the local date and time when this object was created.
     */
    public Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Get the action code; a string-representation of a game-specific ontological
     * action that the player initiated or endured.
     *
     * @return the action code corresponding to the occurred action in the ontology.
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Get the string representation of this GameAction.
     *
     * @return  a string of the form "{ [hours:minutes:seconds], [actionCode] }".
     */
    @Override
    public String toString() {
        return String.format("{ [%d:%d:%d], [%s] }",
                timeCreated.getHours(),
                timeCreated.getMinutes(),
                timeCreated.getSeconds(),
                actionCode);
    }
}

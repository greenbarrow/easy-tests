package easytests.models.empty;

import easytests.models.ModelInterface;
import easytests.models.exceptions.CreateEmptyModelWithNullIdException;
import easytests.models.exceptions.CreateEmptyModelWithoutIdException;
import lombok.Getter;


/**
 * @author malinink
 */
public abstract class AbstractModelEmpty implements ModelInterface {
    @Getter
    private Integer id;

    public AbstractModelEmpty(Integer id) {
        if (id == null) {
            throw new CreateEmptyModelWithNullIdException();
        }
        this.id = id;
    }

    public AbstractModelEmpty() {
        throw new CreateEmptyModelWithoutIdException();
    }
}

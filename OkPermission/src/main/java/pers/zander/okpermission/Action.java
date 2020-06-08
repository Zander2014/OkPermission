package pers.zander.okpermission;

/**
 * Created by Zander on 2020-06-08.
 */
public interface Action<T> {

    /**
     * An action.
     *
     * @param data the data.
     */
    void onAction(T data);
}
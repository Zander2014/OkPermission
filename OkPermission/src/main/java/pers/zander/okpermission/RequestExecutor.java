package pers.zander.okpermission;

/**
 * <p>Request executor.</p>
 * Created by Zander on 2020-06-08.
 */
public interface RequestExecutor {

    /**
     * Go request permission.
     */
    void execute();

    /**
     * Cancel the operation.
     */
    void cancel();

}
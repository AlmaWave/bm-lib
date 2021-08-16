package it.almawave.ps.batch.manager.bmlib.model.enumeration;

/**
 * @author Andrea Rocco Lotronto
 * @date 03/05/21
 */
public enum BatchStatus {
    READY(10L),
    RUNNING(20L),
    ERROR(30L),
    FINISHED(40L);

    private final Long status;

    private BatchStatus(Long status){
        this.status = status;
    }

    public Long getStatus(){
        return status;
    }

}

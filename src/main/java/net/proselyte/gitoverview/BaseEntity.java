package net.proselyte.gitoverview;

public class BaseEntity {

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;

    public boolean isNew(){
        return (this.id == null);
    }
}
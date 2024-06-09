package prototype;

/**
 * Фабрика проектов, добавлена для того, чтобы
 * не приводить постоянно клонируемый объект к типу Project
 * @author alkl1m
 */
public class ProjectFactory {

    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Project cloneProject() {
        return (Project) project.copy();
    }
}

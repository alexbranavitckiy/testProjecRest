package scanpackage.service;

import scanpackage.models.ProjectModel;

import java.util.List;

public interface GenericsService<T> {
    List<T> getAll();

    T findById(Integer id);

    T save(T model);

    T update(T task);
}

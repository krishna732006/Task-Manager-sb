package com.krishna.taskmanager.service;

import com.krishna.taskmanager.entity.Task;
import com.krishna.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repo;

    public Task createTask(Task task) {
        return repo.save(task);
    }

    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    public Task getTask(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Task updateTask(Long id, Task updated) {
        Task task = repo.findById(id).orElseThrow();
        task.setTitle(updated.getTitle());
        task.setDescription(updated.getDescription());
        task.setStatus(updated.getStatus());
        return repo.save(task);
    }

    public void deleteTask(Long id) {
        repo.deleteById(id);
    }
}
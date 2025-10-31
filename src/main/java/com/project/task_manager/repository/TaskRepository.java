package com.project.task_manager.repository;

import com.project.task_manager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TaskRepository extends JpaRepository<Task, Long> {}


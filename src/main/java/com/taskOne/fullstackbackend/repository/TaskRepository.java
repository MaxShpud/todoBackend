package com.taskOne.fullstackbackend.repository;

import com.taskOne.fullstackbackend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}

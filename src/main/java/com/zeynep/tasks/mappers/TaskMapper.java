package com.zeynep.tasks.mappers;

import com.zeynep.tasks.domain.dto.TaskDto;
import com.zeynep.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);
}

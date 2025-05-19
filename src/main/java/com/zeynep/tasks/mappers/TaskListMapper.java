package com.zeynep.tasks.mappers;

import com.zeynep.tasks.domain.dto.TaskListDto;
import com.zeynep.tasks.domain.entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);
}

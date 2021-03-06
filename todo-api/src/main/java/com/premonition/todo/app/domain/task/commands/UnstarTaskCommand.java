package com.premonition.todo.app.domain.task.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnstarTaskCommand {

    @TargetAggregateIdentifier
    private String id;
}
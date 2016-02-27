package com.premonition.todo.app.domain.task.commands;

import javax.validation.constraints.NotNull;

import lombok.Value;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * @author albert
 */
@Value
public class ModifyTaskTitleCommand {

	@TargetAggregateIdentifier
	private final String id;

	@NotNull
	private final String title;
}


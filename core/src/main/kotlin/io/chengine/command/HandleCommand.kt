package io.chengine.command

/**
 * Handles a command.
 *
 */
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class HandleCommand(val command: String)

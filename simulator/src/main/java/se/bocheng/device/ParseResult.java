package se.bocheng.device;

public sealed interface ParseResult {
    record Success(CommandType command) implements ParseResult {
    }

    record SuccessSpeed(int speed) implements ParseResult {
    }

    record Failure(CommandErrorType commandError) implements ParseResult {
    }
}

#!/bin/bash

# Simulated task function
simulate_task() {
    local task_name=$1
    local duration=$2
    echo "[$task_name] Started (will take $duration seconds)..."
    sleep "$duration"
    echo "[$task_name] Completed!"
}

# Start tasks in parallel
simulate_task "Task 1" 3 &
pid1=$!

simulate_task "Task 2" 5 &
pid2=$!

simulate_task "Task 3" 2 &
pid3=$!

# Wait for all tasks to complete
wait $pid1
wait $pid2
wait $pid3

echo "✅ All tasks completed in parallel!"

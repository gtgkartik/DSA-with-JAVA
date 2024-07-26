## Remove outer most parantheses

### Example Walkthrough

Let's walk through an example to see how this function works.

### Input: `"(()())(())"`

1. **Initial State**:
    - `str = "(()())(())"`
    - `arr = ['(', '(', ')', '(', ')', ')', '(', '(', ')', ')']`
    - `stack = []`
    - `res = ""`
    - `word = ""`
2. **Processing Characters**:
    - Character `'('`:
        - Push `'('` onto the stack.
        - `stack = ['(']`
        - `word = "("`
    - Character `'('`:
        - Push `'('` onto the stack.
        - `stack = ['(', '(']`
        - `word = "(("`
    - Character `')'`:
        - Pop from the stack.
        - `stack = ['(']`
        - `word = "(("`
    - Character `')'`:
        - Pop from the stack.
        - `stack = []`
        - `word = "(())"`
        - Since the stack is empty, we have a complete primitive string `"(())"`.
        - Remove the outer parentheses and append `"()"` to `res`.
        - `res = "()"`
    - Character `'('`:
        - Push `'('` onto the stack.
        - `stack = ['(']`
        - `word = "("`
    - Character `'('`:
        - Push `'('` onto the stack.
        - `stack = ['(', '(']`
        - `word = "(("`
    - Character `')'`:
        - Pop from the stack.
        - `stack = ['(']`
        - `word = "(())"`
    - Character `')'`:
        - Pop from the stack.
        - `stack = []`
        - `word = "(())"`
        - Since the stack is empty, we have another complete primitive string `"(())"`.
        - Remove the outer parentheses and append `"()"` to `res`.
        - `res = "()()"`
3. **Final Result**:
    - The final string `res` is `"()()"`.
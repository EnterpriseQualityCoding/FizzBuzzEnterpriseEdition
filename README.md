# FizzBuzzEnterpriseEdition

[![Build status][Build status image]][Build status URL] [![codecov.io](https://codecov.io/github/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition/coverage.svg?branch=master)](https://codecov.io/github/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition?branch=master)

[Build status image]: https://secure.travis-ci.org/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition.png?branch=master
[Build status URL]: http://travis-ci.org/EnterpriseQualityCoding/FizzBuzzEnterpriseEdition

Enterprise software marks a special high-grade class of software that makes
careful use of relevant software architecture design principles to build
particularly customizable and extensible solutions to real problems. This
project is an example of how the popular FizzBuzz game might be built were it
subject to the high quality standards of enterprise software.

## FizzBuzz

FizzBuzz is a game that has gained in popularity as a programming assignment to
weed out non-programmers during job interviews. The object of the assignment is
less about solving it correctly according to the below rules and more about
showing the programmer understands basic, necessary tools such as
`if`-/`else`-statements and loops. The rules of FizzBuzz are as follows:

For numbers 1 through 100,

* if the number is divisible by 3 print Fizz;
* if the number is divisible by 5 print Buzz;
* if the number is divisible by 3 and 5 (15) print FizzBuzz;
* else, print the number.

## Contributing

Although this project is intended as satire, we take openness and inclusivity
very seriously. To that end we have adopted the following code of conduct.

[Contributor Code of Conduct](CONTRIBUTING.md)

## Agent Skills

We support agent skills to enhance development workflows. You can install new skills using the provided `install_skill.sh` script at the root of the project.

### Usage

1. **Create from Template**: Create an empty skill with a `SKILL.md` template.
   ```bash
   ./install_skill.sh my-new-skill
   ```
2. **Install from Local Folder**: Import an existing local skill directory.
   ```bash
   ./install_skill.sh my-new-skill /path/to/skill/folder
   ```
3. **Install from Git Repository**: Automatically clone and deploy a skill from an external repository.
   ```bash
   ./install_skill.sh my-new-skill https://github.com/user/repo.git
   ```

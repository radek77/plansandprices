alias deltag='~/deltag.sh $1'
alias delbranch='~/delbranch.sh $1'
alias cls='printf "\033c"'
alias fix='~/fix.sh $1'
alias sms='./sms.sh'
alias ta='~/ta.sh'
alias xd='~/xd.sh'
alias gfa='git fetch --all'
alias gpod='git pull origin develop'
alias gs='git status'
alias gpl='git pull'
alias pa='php artisan $@'
alias gc='git clean -fdx'
alias md='pandoc /var/www/code/README.md | lynx -stdin'
alias qw='php service/artisan queue:work'
alias cr='cd /var/www/code/service && vendor/bin/codecept run $@'
alias pu='cd /var/www/code/service && vendor/bin/phpunit $@'
alias cu='composer update'
alias ci='composer install'

parse_git_repo_name() {
    if git rev-parse --git-dir > /dev/null 2>&1; then
	basename `git rev-parse --show-toplevel` 2> /dev/null | sed -e '/^\r\n]/d'
    fi;
}
parse_git_branch() {
    if git rev-parse --git-dir > /dev/null 2>&1; then
        git branch 2> /dev/null | sed -e '/^[^*]/d' -e 's/* \(.*\)/ (\1)/'
    fi;
}
parse_pwd() {
     basename `pwd` 2> /dev/null
}
export PS1="\u \[\033[35m\][$CONTAINER_NAME]\[\033[36m\] \[\033[32m\]\$(parse_pwd)\[\033[36m\] \$(parse_git_repo_name)\[\033[33m\]\$(parse_git_branch)\[\033[00m\] $ "
export DEV_ENVIRONMENT=docker
export PHP_IDE_CONFIG="serverName=subs.web"

export HISTCONTROL=ignoredups:erasedups
export SAVEHIST=100000
export HISTSIZE=10000
export HISTFILESIZE=100000
export HISTFILE=~/.bash_history
shopt -s histappend
